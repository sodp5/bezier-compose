@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Trash: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _trash ?: ImageVector.Builder(
                    name = "Trash",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(14.0f, 4.0f)
                    lineTo(10.0f, 4.0f)
                    lineTo(10.0f, 5.0f)
                    lineTo(14.0f, 5.0f)
                    close()
                    moveTo(16.0f, 5.0f)
                    lineTo(20.0f, 5.0f)
                    lineTo(20.0f, 7.0f)
                    lineTo(19.0f, 7.0f)
                    lineTo(19.0f, 18.0f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 15.0f, 22.0f)
                    lineTo(9.0f, 22.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 18.0f)
                    lineTo(5.0f, 7.0f)
                    lineTo(4.0f, 7.0f)
                    lineTo(4.0f, 5.0f)
                    lineTo(8.0f, 5.0f)
                    lineTo(8.0f, 3.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 2.0f)
                    lineTo(14.5f, 2.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 3.5f)
                    close()
                    moveTo(7.0f, 18.0f)
                    lineTo(7.0f, 7.0f)
                    lineTo(17.0f, 7.0f)
                    lineTo(17.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 15.0f, 20.0f)
                    lineTo(9.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 18.0f)
                    moveTo(9.0f, 10.0f)
                    lineTo(9.0f, 17.0f)
                    lineTo(11.0f, 17.0f)
                    lineTo(11.0f, 10.0f)
                    close()
                    moveTo(13.0f, 17.0f)
                    lineTo(13.0f, 10.0f)
                    lineTo(15.0f, 10.0f)
                    lineTo(15.0f, 17.0f)
                    close()
                }
            }.build().also {
                _trash = it
            }
    }


private var _trash: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrashIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Trash.imageVector,
            contentDescription = null,
    )
}