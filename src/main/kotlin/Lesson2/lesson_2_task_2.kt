fun main(){
    val sumOldEmployees = 50
    val incomeOneOldEmployees = 30000
    val expensesForOldEmployees = sumOldEmployees*incomeOneOldEmployees

    val sumNewEmployees = 30
    val incomeOneNewEmployees = 20000
    val expensesForNewEmployees = sumNewEmployees*incomeOneNewEmployees
    val expensesForAllEmployees = expensesForOldEmployees + expensesForNewEmployees
    val averageOfEmployeesIncome = expensesForAllEmployees/80


    println(expensesForOldEmployees)
    println(expensesForAllEmployees)
    println(averageOfEmployeesIncome)
}
