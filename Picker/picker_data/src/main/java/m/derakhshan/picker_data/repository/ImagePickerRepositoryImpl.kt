package m.derakhshan.picker_data.repository

import m.derakhshan.picker_domain.repository.ImagePickerRepository
import java.io.File

class ImagePickerRepositoryImpl : ImagePickerRepository {
    override suspend fun loadImagesUri(page: Int, pageSize: Int): List<String> {
        return emptyList()
    }

    override suspend fun compressImages(images: List<File>): List<File> {
        return emptyList()
    }



     fun getGalleryImages(limit: Int, offset: Int): List<ImageDataModel> {
        return ImageMediaStore(context = context).getImagesFromMediaStore(
            limit = limit,
            offset = offset
        )
    }


    private suspend fun compressImage(uri: Uri): Uri {
        val compressedImageFile =
            Compressor.compress(context, getFileFromUri(uri, context)) {
                resolution(512, 512)
                quality(90)
                format(Bitmap.CompressFormat.JPEG)
                size(524_288)
            }
        return Uri.fromFile(compressedImageFile)
    }

    private fun getFileFromUri(uri: Uri, context: Context): File {
        val contentResolver = context.contentResolver
        val file = File(context.cacheDir, "temp")
        try {
            val inputStream = contentResolver.openInputStream(uri)
            val outputStream = FileOutputStream(file)
            val buf = ByteArray(1024)
            var len: Int
            while (inputStream?.read(buf).also { len = it!! }!! > 0) {
                outputStream.write(buf, 0, len)
            }
            outputStream.close()
            inputStream?.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return file
    }

}