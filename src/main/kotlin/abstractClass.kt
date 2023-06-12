// we use abstract keyword to make a class abstract.
// abstract class is similar to interface, but it can't be used to create objects.
// abstract properties must be overridden in subclass.
abstract class ShapeDrawer {
    fun drawSquare(x: Int, y: Int, size: Int) {
        drawLine(x, y, x + size, y)
        drawLine(x + size, y, x + size, y + size)
        drawLine(x, y, x, y + size)
        drawLine(x, y + size, x + size, y + size)
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x, y, x, y + height)
        drawLine(x, y + height, x + width, y + height)
    }
    internal abstract fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int)
}
class AndroidShapeDrawer : ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {/*..*/}
}
class DesktopShapeDrawer : ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {/*..*/}
}
fun main() {
    val androidDrawer : ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare(4, 4, 4)
    val desktopDrawer : ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawRectangle(4, 3, 4, 3)
}