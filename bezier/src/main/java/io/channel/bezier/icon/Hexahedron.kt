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

val BezierIcons.Hexahedron: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _hexahedron ?: ImageVector.Builder(
                    name = "Hexahedron",
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
                    moveTo(13.0f, 2.577f)
                    arcTo(2.0f, 2.0f, 300.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 2.577f)
                    lineTo(4.0f, 6.62f)
                    arcTo(2.0f, 2.0f, 240.00003480239235f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 8.35f)
                    lineTo(3.0f, 16.433f)
                    arcTo(2.0f, 2.0f, 179.998544459905f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 18.165f)
                    lineTo(11.0f, 22.206f)
                    arcTo(2.0f, 2.0f, 120.00000000000001f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 22.206f)
                    lineTo(20.0f, 18.165f)
                    arcTo(2.0f, 2.0f, 60.000000021348384f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 16.433f)
                    lineTo(21.0f, 8.35f)
                    arcTo(2.0f, 2.0f, 359.99854445965457f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 6.617999999999999f)
                    close()
                    moveTo(5.696f, 7.822f)
                    lineTo(12.0f, 4.182f)
                    lineTo(18.304000000000002f, 7.822000000000001f)
                    lineTo(12.0f, 11.447f)
                    close()
                    moveTo(4.89f, 9.665f)
                    lineTo(4.89f, 16.497999999999998f)
                    lineTo(11.0f, 20.025f)
                    lineTo(11.0f, 13.177999999999997f)
                    close()
                    moveTo(13.0f, 20.025f)
                    lineTo(19.11f, 16.497999999999998f)
                    lineTo(19.11f, 9.664f)
                    lineTo(13.0f, 13.178f)
                    close()
                }
            }.build().also {
                _hexahedron = it
            }
    }


private var _hexahedron: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HexahedronIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Hexahedron.imageVector,
            contentDescription = null,
    )
}