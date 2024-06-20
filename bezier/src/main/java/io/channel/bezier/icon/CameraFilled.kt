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

val BezierIcons.CameraFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cameraFilled ?: ImageVector.Builder(
                    name = "CameraFilled",
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
                    moveTo(16.583f, 4.471f)
                    arcTo(2.0f, 2.0f, 329.0359598576591f, isMoreThanHalf = false, isPositiveArc = false, 14.867999999999999f, 3.5f)
                    lineTo(9.132f, 3.5f)
                    arcTo(2.0f, 2.0f, 270.00055124369493f, isMoreThanHalf = false, isPositiveArc = false, 7.417f, 4.471f)
                    lineTo(6.7909999999999995f, 5.514f)
                    arcTo(1.0f, 1.0f, 30.930616130268074f, isMoreThanHalf = false, isPositiveArc = true, 5.934f, 6.0f)
                    lineTo(5.0f, 6.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 9.0f)
                    lineTo(2.0f, 17.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 20.0f)
                    lineTo(19.0f, 20.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 17.0f)
                    lineTo(22.0f, 9.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 6.0f)
                    lineTo(18.066f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0452849442517f, isMoreThanHalf = false, isPositiveArc = true, 17.209f, 5.514f)
                    close()
                    moveTo(12.0f, 18.0f)
                    arcTo(5.506f, 5.506f, 90.0624024045885f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 12.5f)
                    curveTo(6.5f, 9.467f, 8.967f, 7.0f, 12.0f, 7.0f)
                    curveTo(15.033f, 7.0f, 17.5f, 9.467f, 17.5f, 12.5f)
                    curveTo(17.5f, 15.533f, 15.033f, 18.0f, 12.0f, 18.0f)
                    moveTo(8.0f, 12.5f)
                    arcTo(4.0f, 4.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 12.5f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 8.0f, 12.5f)
                }
            }.build().also {
                _cameraFilled = it
            }
    }


private var _cameraFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CameraFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CameraFilled.imageVector,
            contentDescription = null,
    )
}