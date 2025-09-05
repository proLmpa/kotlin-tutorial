package org.example.templateMethod

// Abstract class : Define the algorithm's skeleton
abstract class DataProcessor {
    // Template Method : Define the algorithm's total flow
    fun process() {
        loadData()
        processData()
        saveData()
    }

    // The process to be established in subclasses
    protected abstract fun loadData()
    protected abstract fun processData()
    protected abstract fun saveData()
}

// ConcreteClass 1
class CsvDataProcessor : DataProcessor() {
    override fun loadData() = println("[CsvDataProcessor] loadData")

    override fun processData() = println("[CsvDataProcessor] processData")

    override fun saveData() = println("[CsvDataProcessor] saveData")
}

// ConcreteClass 2
class JsonDataProcessor : DataProcessor() {
    override fun loadData() = println("[JsonDataProcessor] loadData")

    override fun processData() = println("[JsonDataProcessor] processData")

    override fun saveData() = println("[JsonDataProcessor] saveData")
}

// Client
fun main() {
    val csvProcessor: DataProcessor = CsvDataProcessor()
    csvProcessor.process()

    println("------")

    val jsonProcessor: DataProcessor = JsonDataProcessor()
    jsonProcessor.process()
}