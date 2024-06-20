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

val BezierIcons.ChevronRight: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chevronRight ?: ImageVector.Builder(
                    name = "ChevronRight",
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
                    moveTo(8.793f, 4.293f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 10.206999999999999f, 4.293f)
                    lineTo(17.207f, 11.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 17.207f, 12.706999999999999f)
                    lineTo(10.207f, 19.707f)
                    arcTo(1.0f, 1.0f, 45.99574461357758f, isMoreThanHalf = false, isPositiveArc = true, 8.793000000000001f, 18.293f)
                    lineTo(15.086f, 12.0f)
                    lineTo(8.793f, 5.707f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 8.793f, 4.293f)
                }
            }.build().also {
                _chevronRight = it
            }
    }


private var _chevronRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronRight.imageVector,
            contentDescription = null,
    )
}