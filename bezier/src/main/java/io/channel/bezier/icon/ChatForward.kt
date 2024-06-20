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

val BezierIcons.ChatForward: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chatForward ?: ImageVector.Builder(
                    name = "ChatForward",
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
                    moveTo(13.664f, 2.135f)
                    quadTo(13.834f, 2.163f, 14.0f, 2.195f)
                    lineTo(14.0f, 4.244999999999999f)
                    arcTo(8.423f, 8.423f, 283.85342623284936f, isMoreThanHalf = false, isPositiveArc = false, 11.998f, 4.0f)
                    arcTo(7.93f, 7.93f, 270.1898769138776f, isMoreThanHalf = false, isPositiveArc = false, 6.35f, 6.337f)
                    curveTo(4.51f, 8.174f, 3.691f, 10.722f, 4.106999999999999f, 13.327f)
                    curveTo(4.648999999999999f, 16.712f, 7.409999999999999f, 19.421f, 10.823f, 19.914f)
                    arcTo(7.98f, 7.98f, 98.41986416713209f, isMoreThanHalf = false, isPositiveArc = false, 15.749f, 19.060000000000002f)
                    curveTo(16.391000000000002f, 18.716f, 17.106f, 18.647000000000002f, 17.764f, 18.866000000000003f)
                    lineTo(19.419999999999998f, 19.418000000000003f)
                    lineTo(18.868f, 17.763f)
                    curveTo(18.65f, 17.107000000000003f, 18.718f, 16.391000000000002f, 19.061f, 15.747000000000002f)
                    arcTo(7.9f, 7.9f, 28.220030351975097f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 12.0f)
                    lineTo(22.0f, 12.0f)
                    lineTo(22.0f, 11.807f)
                    arcTo(9.9f, 9.9f, 358.84153893919176f, isMoreThanHalf = false, isPositiveArc = true, 20.825f, 16.689f)
                    curveTo(20.777f, 16.779f, 20.706f, 16.956f, 20.765f, 17.132f)
                    lineTo(21.633f, 19.735000000000003f)
                    curveTo(21.813f, 20.278000000000002f, 21.675f, 20.866000000000003f, 21.27f, 21.270000000000003f)
                    arcTo(1.5f, 1.5f, 44.97428822193103f, isMoreThanHalf = false, isPositiveArc = true, 19.735f, 21.633000000000003f)
                    lineTo(17.13f, 20.765000000000004f)
                    curveTo(16.956f, 20.706000000000003f, 16.779999999999998f, 20.776000000000003f, 16.689999999999998f, 20.825000000000003f)
                    arcTo(9.9f, 9.9f, 61.80108582664976f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 22.0f)
                    quadTo(11.27f, 22.0f, 10.536f, 21.894f)
                    curveTo(6.266f, 21.278f, 2.8099999999999996f, 17.884f, 2.1319999999999997f, 13.643999999999998f)
                    curveTo(1.6129999999999995f, 10.396999999999998f, 2.635f, 7.2189999999999985f, 4.936f, 4.921999999999999f)
                    curveTo(7.237f, 2.624999999999999f, 10.416f, 1.6119999999999988f, 13.664f, 2.134999999999999f)
                    moveTo(19.0f, 8.775f)
                    lineTo(19.0f, 7.0f)
                    lineTo(17.9f, 7.0f)
                    arcTo(2.9f, 2.9f, 269.99999999999994f, isMoreThanHalf = false, isPositiveArc = false, 15.0f, 9.9f)
                    lineTo(15.0f, 10.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 13.0f, 10.0f)
                    lineTo(13.0f, 9.9f)
                    arcTo(4.9f, 4.9f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 17.9f, 5.0f)
                    lineTo(19.0f, 5.0f)
                    lineTo(19.0f, 3.225f)
                    curveTo(19.0f, 2.58f, 19.752f, 2.258f, 20.191f, 2.713f)
                    lineTo(22.744f, 5.361000000000001f)
                    curveTo(23.085f, 5.714f, 23.085f, 6.2860000000000005f, 22.744f, 6.639000000000001f)
                    lineTo(20.191f, 9.287f)
                    curveTo(19.750999999999998f, 9.742f, 19.0f, 9.420000000000002f, 19.0f, 8.775f)
                }
            }.build().also {
                _chatForward = it
            }
    }


private var _chatForward: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatForwardIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatForward.imageVector,
            contentDescription = null,
    )
}