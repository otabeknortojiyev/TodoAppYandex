package uz.yayra.otabek.domain.home.impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.yayra.otabek.data.repository.TodoItemRepository
import uz.yayra.otabek.domain.home.SetThemeUseCase
import javax.inject.Inject

class SetThemeUseCaseImpl @Inject constructor(private val homeRepository: TodoItemRepository) : SetThemeUseCase {
    override fun invoke(): Flow<Unit> = flow {
        homeRepository.setTheme()
        emit(Unit)
    }
}