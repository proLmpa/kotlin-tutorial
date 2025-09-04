//package org.example.factory
//
//// Product
//interface Button {
//    fun render()
//}
//
//// Concrete Products
//class WindowsButton : Button {
//    override fun render() = println("Rendering Windows Button")
//}
//
//class MacButton : Button {
//    override fun render() = println("Rendering Mac Button")
//}
//
//// Creator (Factory Method 보유)
//abstract class Dialog {
//    abstract fun createButton(): Button
//
//    fun renderDialog() {
//        val button = createButton()
//        println("Rendering Common Dialog..")
//        button.render()
//    }
//}
//
//// Concrete Creators
//class WindowsDialog : Dialog() {
//    override fun createButton(): Button = WindowsButton()
//}
//
//class MacDialog : Dialog() {
//    override fun createButton(): Button = MacButton()
//}
//
//// Client
//fun main() {
//    val os = System.getProperty("os.name").lowercase()
//    val dialog: Dialog = if("win" in os) WindowsDialog() else MacDialog()
//    dialog.renderDialog()
//}