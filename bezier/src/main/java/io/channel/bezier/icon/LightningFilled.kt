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

val BezierIcons.LightningFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _lightningFilled ?: ImageVector.Builder(
                    name = "LightningFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(16.557f, 3.354f)
                    curveTo(17.180999999999997f, 1.9360000000000002f, 15.380999999999998f, 0.7050000000000001f, 14.284999999999998f, 1.8010000000000002f)
                    lineTo(5.0f, 11.086f)
                    curveTo(3.74f, 12.346f, 4.632f, 14.5f, 6.414f, 14.5f)
                    lineTo(9.884f, 14.5f)
                    lineTo(7.61f, 20.079f)
                    curveTo(6.98f, 21.624000000000002f, 8.966000000000001f, 22.889f, 10.100000000000001f, 21.664f)
                    lineTo(19.179000000000002f, 11.859000000000002f)
                    curveTo(20.364f, 10.579000000000002f, 19.456000000000003f, 8.500000000000002f, 17.711000000000002f, 8.500000000000002f)
                    lineTo(14.293000000000003f, 8.500000000000002f)
                    close()
                }
            }.build().also {
                _lightningFilled = it
            }
    }


private var _lightningFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LightningFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.LightningFilled.imageVector,
            contentDescription = null,
    )
}
