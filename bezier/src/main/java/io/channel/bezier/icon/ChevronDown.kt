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

val BezierIcons.ChevronDown: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chevronDown ?: ImageVector.Builder(
                    name = "ChevronDown",
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
                    moveTo(19.707f, 8.793f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 19.707f, 10.206999999999999f)
                    lineTo(12.707f, 17.207f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 11.293000000000001f, 17.207f)
                    lineTo(4.293000000000001f, 10.207f)
                    arcTo(1.0f, 1.0f, 135.99574461357975f, isMoreThanHalf = false, isPositiveArc = true, 5.707000000000001f, 8.793000000000001f)
                    lineTo(12.0f, 15.086f)
                    lineTo(18.293f, 8.793f)
                    arcTo(1.0f, 1.0f, 225.0086516628379f, isMoreThanHalf = false, isPositiveArc = true, 19.707f, 8.793f)
                }
            }.build().also {
                _chevronDown = it
            }
    }


private var _chevronDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronDown.imageVector,
            contentDescription = null,
    )
}
