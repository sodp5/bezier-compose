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

val BezierIcons.AutoClose: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _autoClose ?: ImageVector.Builder(
                    name = "AutoClose",
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
                    moveTo(11.674f, 8.785f)
                    arcTo(0.355f, 0.355f, 156.68023232886028f, isMoreThanHalf = false, isPositiveArc = false, 12.325999999999999f, 8.785f)
                    lineTo(13.063999999999998f, 7.064f)
                    lineTo(14.784999999999998f, 6.3260000000000005f)
                    arcTo(0.355f, 0.355f, 66.68023232886046f, isMoreThanHalf = false, isPositiveArc = false, 14.784999999999998f, 5.674f)
                    lineTo(13.063999999999998f, 4.936f)
                    lineTo(12.325999999999999f, 3.215f)
                    arcTo(0.355f, 0.355f, 336.68023232886026f, isMoreThanHalf = false, isPositiveArc = false, 11.674f, 3.215f)
                    lineTo(10.936f, 4.936f)
                    lineTo(9.215f, 5.6739999999999995f)
                    arcTo(0.355f, 0.355f, 246.68023232886043f, isMoreThanHalf = false, isPositiveArc = false, 9.215f, 6.326f)
                    lineTo(10.936f, 7.064f)
                    close()
                    moveTo(17.674f, 20.785f)
                    arcTo(0.355f, 0.355f, 156.68023232886063f, isMoreThanHalf = false, isPositiveArc = false, 18.326f, 20.785f)
                    lineTo(19.064f, 19.064f)
                    lineTo(20.785f, 18.326f)
                    arcTo(0.355f, 0.355f, 66.68023232886061f, isMoreThanHalf = false, isPositiveArc = false, 20.785f, 17.674f)
                    lineTo(19.064f, 16.936f)
                    lineTo(18.326f, 15.215f)
                    arcTo(0.355f, 0.355f, 336.6802323288606f, isMoreThanHalf = false, isPositiveArc = false, 17.674f, 15.215f)
                    lineTo(16.936f, 16.936f)
                    lineTo(15.215f, 17.674f)
                    arcTo(0.355f, 0.355f, 246.6802323288606f, isMoreThanHalf = false, isPositiveArc = false, 15.215f, 18.326f)
                    lineTo(16.936f, 19.064f)
                    close()
                    moveTo(4.121f, 11.192f)
                    lineTo(9.071000000000002f, 16.142f)
                    lineTo(19.432f, 5.78f)
                    arcTo(1.0f, 1.0f, 224.00425538642233f, isMoreThanHalf = true, isPositiveArc = true, 20.846f, 7.194f)
                    lineTo(9.778f, 18.263f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 8.364f, 18.263f)
                    lineTo(2.7070000000000007f, 12.606000000000002f)
                    arcTo(1.0f, 1.0f, 135.99574461357975f, isMoreThanHalf = false, isPositiveArc = true, 4.121f, 11.192000000000002f)
                }
            }.build().also {
                _autoClose = it
            }
    }


private var _autoClose: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AutoCloseIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.AutoClose.imageVector,
            contentDescription = null,
    )
}