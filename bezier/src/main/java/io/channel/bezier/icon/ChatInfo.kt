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

val BezierIcons.ChatInfo: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chatInfo ?: ImageVector.Builder(
                    name = "ChatInfo",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(12.0f, 6.0f)
                    arcTo(1.5f, 1.5f, 269.9618024053784f, isMoreThanHalf = true, isPositiveArc = true, 12.002f, 9.0f)
                    arcTo(1.5f, 1.5f, 89.96180323325515f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 6.0f)
                    moveTo(13.0f, 18.0f)
                    lineTo(11.0f, 18.0f)
                    lineTo(11.0f, 10.0f)
                    lineTo(13.0f, 10.0f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(20.765f, 17.132f)
                    curveTo(20.707f, 16.955000000000002f, 20.778000000000002f, 16.779f, 20.825f, 16.689f)
                    curveTo(21.93f, 14.622f, 22.265f, 12.295f, 21.794999999999998f, 9.96f)
                    curveTo(20.985f, 5.9350000000000005f, 17.717999999999996f, 2.7910000000000013f, 13.664999999999997f, 2.1350000000000007f)
                    curveTo(10.420999999999998f, 1.6110000000000007f, 7.237999999999998f, 2.625000000000001f, 4.935999999999998f, 4.922000000000001f)
                    curveTo(2.6359999999999983f, 7.218f, 1.6129999999999982f, 10.397f, 2.1319999999999983f, 13.643f)
                    curveTo(2.8099999999999983f, 17.884f, 6.265999999999998f, 21.278f, 10.535999999999998f, 21.894f)
                    quadTo(11.272f, 22.0f, 12.0f, 22.0f)
                    arcTo(9.9f, 9.9f, 90.06395161260967f, isMoreThanHalf = false, isPositiveArc = false, 16.691f, 20.824f)
                    curveTo(16.781f, 20.777f, 16.957f, 20.707f, 17.131f, 20.765f)
                    lineTo(19.736f, 21.633f)
                    curveTo(20.276f, 21.811f, 20.866f, 21.675f, 21.271f, 21.27f)
                    curveTo(21.675f, 20.866f, 21.814f, 20.278f, 21.633f, 19.735f)
                    close()
                    moveTo(19.061f, 15.747000000000002f)
                    curveTo(18.718f, 16.391000000000002f, 18.649f, 17.107000000000003f, 18.868f, 17.764000000000003f)
                    lineTo(19.418999999999997f, 19.419000000000004f)
                    lineTo(17.763999999999996f, 18.867000000000004f)
                    curveTo(17.105999999999995f, 18.648000000000003f, 16.391999999999996f, 18.717000000000006f, 15.747999999999996f, 19.060000000000006f)
                    arcTo(7.97f, 7.97f, 61.873741509006734f, isMoreThanHalf = false, isPositiveArc = true, 10.821999999999996f, 19.915000000000006f)
                    curveTo(7.409999999999996f, 19.422000000000008f, 4.647999999999995f, 16.713000000000008f, 4.106999999999996f, 13.327000000000005f)
                    curveTo(3.690999999999996f, 10.723000000000006f, 4.507999999999996f, 8.175000000000004f, 6.349999999999996f, 6.338000000000005f)
                    arcTo(7.93f, 7.93f, 224.8428208785278f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 4.0f)
                    curveTo(12.443f, 4.0f, 12.894f, 4.036f, 13.345f, 4.11f)
                    arcTo(7.945f, 7.945f, 279.36797247901984f, isMoreThanHalf = false, isPositiveArc = true, 19.835f, 10.354f)
                    curveTo(20.212f, 12.229f, 19.945f, 14.094f, 19.061f, 15.747f)
                }
            }.build().also {
                _chatInfo = it
            }
    }


private var _chatInfo: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatInfoIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatInfo.imageVector,
            contentDescription = null,
    )
}