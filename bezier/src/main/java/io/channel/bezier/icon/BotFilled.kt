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

val BezierIcons.BotFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _botFilled ?: ImageVector.Builder(
                    name = "BotFilled",
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
                    moveTo(12.004f, 2.002f)
                    arcTo(2.975f, 2.975f, 269.9807376761769f, isMoreThanHalf = false, isPositiveArc = true, 14.98f, 4.978f)
                    lineTo(9.028f, 4.978f)
                    arcTo(2.976f, 2.976f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 12.004000000000001f, 2.002f)
                    moveTo(14.412f, 12.974f)
                    curveTo(14.412f, 14.761f, 14.834000000000001f, 15.49f, 15.844000000000001f, 15.49f)
                    curveTo(16.854f, 15.49f, 17.276f, 14.761000000000001f, 17.276f, 12.974f)
                    curveTo(17.276f, 11.187f, 16.854f, 10.459f, 15.844f, 10.459f)
                    curveTo(14.834f, 10.459f, 14.411999999999999f, 11.189f, 14.411999999999999f, 12.974f)
                    moveTo(6.731999999999999f, 12.974f)
                    curveTo(6.731999999999999f, 14.761f, 7.153999999999999f, 15.49f, 8.164f, 15.49f)
                    curveTo(9.174f, 15.49f, 9.596f, 14.761000000000001f, 9.596f, 12.974f)
                    curveTo(9.596f, 11.187f, 9.174f, 10.459f, 8.164f, 10.459f)
                    curveTo(7.154f, 10.459f, 6.731999999999999f, 11.189f, 6.731999999999999f, 12.974f)
                    moveTo(4.186999999999999f, 5.974f)
                    lineTo(19.820999999999998f, 5.974f)
                    curveTo(21.026999999999997f, 5.974f, 22.003999999999998f, 6.9510000000000005f, 22.003999999999998f, 8.157f)
                    lineTo(22.003999999999998f, 17.791f)
                    arcTo(2.183f, 2.183f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 19.820999999999998f, 19.974f)
                    lineTo(4.187f, 19.974f)
                    arcTo(2.183f, 2.183f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0040000000000004f, 17.791f)
                    lineTo(2.0040000000000004f, 8.157f)
                    curveTo(2.0040000000000004f, 6.9510000000000005f, 2.9810000000000003f, 5.974f, 4.187f, 5.974f)
                }
            }.build().also {
                _botFilled = it
            }
    }


private var _botFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BotFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.BotFilled.imageVector,
            contentDescription = null,
    )
}