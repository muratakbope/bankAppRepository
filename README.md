# bankAppRepository

В данном проекте AccountDAO и TransactionDAO реализоны с ипользованием базы данных.
Программа выполняет основные банковские операции, такие как 
1. Получение информации о всех счетах
2. Создание счета
3. Пополнение счета (debit)
4. Снятие денег со счета (withdraw)
   

Пользователь может создать следующие счета:
  * текущий счет (CHECKING)
  * сберегательный счет (SAVING)
  * фиксированный счет (FIXED)

### Как установить и запустить проект

1. Склонируйте репозиторий на свой локальный компьютер:
```
  git clone https://github.com/muratakbope/bankAppRepository
```
2. Откройте проект в вашей Java IDE (например, Intellij IDEA).
3. Запустите проект.

Примечание. Программа работает в командной строке.

### Как использовать
* Для создания счета введите в командной строке '2', затем укажите название счета.
* Для получения списка всех счетов укажите '1'.
* Чтобы пополнить счет введите '3', далее укажите номер счета, затем сумму для пополнения.
* Чтобы снять деньги со счета введите '4', далее указываете номер счета и после сумму для снятия.
* Снимать деньги можно только 'CHECKING' и 'SAVING' счетов. Сумма на счете не может быть меньше нуля.

