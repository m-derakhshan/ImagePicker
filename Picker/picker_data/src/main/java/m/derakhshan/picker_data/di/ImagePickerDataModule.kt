package m.derakhshan.picker_data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import m.derakhshan.picker_data.repository.ImagePickerRepositoryImpl
import m.derakhshan.picker_domain.repository.ImagePickerRepository


@Module
@InstallIn(ViewModelComponent::class)
object ImagePickerDataModule {

    @Provides
    @ViewModelScoped
    fun provideImagePickerRepository(): ImagePickerRepository {
        return ImagePickerRepositoryImpl()
    }


}