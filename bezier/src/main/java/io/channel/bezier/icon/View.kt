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

val BezierIcons.View: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _view ?: ImageVector.Builder(
                    name = "View",
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
                    moveTo(4.39f, 12.514f)
                    curveTo(4.09f, 12.978f, 3.4879999999999995f, 13.168f, 3.0f, 12.908f)
                    curveTo(2.5120000000000005f, 12.648f, 2.326f, 12.038f, 2.62f, 11.571f)
                    curveTo(7.28f, 4.143f, 17.16f, 4.143f, 21.822000000000003f, 11.571f)
                    curveTo(22.116000000000003f, 12.039f, 21.929000000000002f, 12.648f, 21.442000000000004f, 12.908f)
                    curveTo(20.954000000000004f, 13.168f, 20.351000000000003f, 12.978f, 20.052000000000003f, 12.514f)
                    curveTo(16.167f, 6.494999999999999f, 8.275000000000004f, 6.494999999999999f, 4.390000000000002f, 12.514f)
                    moveTo(12.220000000000002f, 9.396999999999998f)
                    arcTo(4.107f, 4.107f, 269.9999988546761f, isMoreThanHalf = true, isPositiveArc = true, 12.220000000000002f, 17.610999999999997f)
                    arcTo(4.107f, 4.107f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 12.220000000000002f, 9.396999999999997f)
                }
            }.build().also {
                _view = it
            }
    }


private var _view: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ViewIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.View.imageVector,
            contentDescription = null,
    )
}