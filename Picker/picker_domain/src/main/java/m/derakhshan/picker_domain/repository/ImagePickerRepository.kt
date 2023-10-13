package m.derakhshan.picker_domain.repository

import java.io.File

interface ImagePickerRepository {
    suspend fun loadImagesUri(page: Int, pageSize: Int = 30): List<String>
    suspend fun compressImages(images:List<File>): List<File>
}