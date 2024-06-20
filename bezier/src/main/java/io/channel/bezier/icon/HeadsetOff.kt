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

val BezierIcons.HeadsetOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _headsetOff ?: ImageVector.Builder(
                    name = "HeadsetOff",
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
                    moveTo(17.996f, 10.253f)
                    curveTo(17.996f, 6.944f, 15.305f, 4.253f, 11.995999999999999f, 4.253f)
                    curveTo(10.371999999999998f, 4.253f, 8.908999999999999f, 4.913f, 7.828999999999999f, 5.965f)
                    lineTo(14.995999999999999f, 13.132f)
                    lineTo(14.995999999999999f, 11.753f)
                    curveTo(14.995999999999999f, 10.926f, 15.668999999999999f, 10.253f, 16.496f, 10.253f)
                    close()
                    moveTo(19.996f, 17.253f)
                    arcTo(0.98f, 0.98f, 0.7109070342894072f, isMoreThanHalf = false, isPositiveArc = true, 19.752f, 17.888f)
                    lineTo(21.541999999999998f, 19.678f)
                    arcTo(1.0f, 1.0f, 315.0202538676118f, isMoreThanHalf = false, isPositiveArc = true, 20.127f, 21.092000000000002f)
                    lineTo(3.157f, 4.122f)
                    arcTo(1.0f, 1.0f, 134.97974758928052f, isMoreThanHalf = false, isPositiveArc = true, 4.571f, 2.707f)
                    lineTo(6.41f, 4.544f)
                    arcTo(7.95f, 7.95f, 225.39375757069956f, isMoreThanHalf = false, isPositiveArc = true, 11.997f, 2.2539999999999996f)
                    curveTo(16.408f, 2.2539999999999996f, 19.997f, 5.842f, 19.997f, 10.254f)
                    close()
                    moveTo(5.995999999999999f, 18.253f)
                    lineTo(5.995999999999999f, 19.253f)
                    curveTo(5.995999999999999f, 19.804f, 6.4449999999999985f, 20.253f, 6.995999999999999f, 20.253f)
                    lineTo(10.995999999999999f, 20.253f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 10.995999999999999f, 22.253f)
                    lineTo(6.995999999999999f, 22.253f)
                    curveTo(5.341999999999999f, 22.253f, 3.9959999999999987f, 20.907f, 3.9959999999999987f, 19.253f)
                    lineTo(3.9959999999999987f, 10.253f)
                    curveTo(3.9959999999999987f, 9.113f, 4.238999999999999f, 8.031f, 4.6709999999999985f, 7.0489999999999995f)
                    lineTo(6.230999999999998f, 8.609f)
                    arcTo(6.0f, 6.0f, 196.08982409817912f, isMoreThanHalf = false, isPositiveArc = false, 5.995999999999998f, 10.253f)
                    lineTo(7.495999999999998f, 10.253f)
                    curveTo(8.322999999999997f, 10.253f, 8.995999999999999f, 10.926f, 8.995999999999999f, 11.753f)
                    lineTo(8.995999999999999f, 16.753f)
                    curveTo(8.995999999999999f, 17.58f, 8.322999999999999f, 18.253f, 7.495999999999999f, 18.253f)
                    close()
                }
            }.build().also {
                _headsetOff = it
            }
    }


private var _headsetOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeadsetOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HeadsetOff.imageVector,
            contentDescription = null,
    )
}