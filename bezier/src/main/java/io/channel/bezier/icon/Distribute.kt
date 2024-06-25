@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Distribute: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _distribute ?: ImageVector.Builder(
                    name = "Distribute",
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
                    moveTo(17.0f, 10.0686f)
                    lineTo(17.0f, 8.0f)
                    lineTo(15.9225f, 8.0f)
                    curveTo(15.0111f, 8.0f, 14.1492f, 8.41427f, 13.5799f, 9.12592f)
                    lineTo(11.9818f, 11.1235f)
                    curveTo(11.7158f, 11.4561f, 11.4114f, 11.7497f, 11.0776f, 12.0f)
                    curveTo(11.4114f, 12.2503f, 11.7158f, 12.5439f, 11.9818f, 12.8765f)
                    lineTo(13.5799f, 14.8741f)
                    curveTo(14.1492f, 15.5857f, 15.0111f, 16.0f, 15.9225f, 16.0f)
                    lineTo(17.0f, 16.0f)
                    lineTo(17.0f, 13.9316f)
                    curveTo(17.0f, 13.2189f, 17.8617f, 12.862f, 18.3657f, 13.3659f)
                    lineTo(21.2929f, 16.2931f)
                    curveTo(21.6834f, 16.6837f, 21.6834f, 17.3168f, 21.2929f, 17.7073f)
                    lineTo(18.3657f, 20.6346f)
                    curveTo(17.8617f, 21.1385f, 17.0f, 20.7816f, 17.0f, 20.0689f)
                    lineTo(17.0f, 18.0f)
                    lineTo(15.9225f, 18.0f)
                    curveTo(14.4036f, 18.0f, 12.967f, 17.3096f, 12.0182f, 16.1235f)
                    lineTo(10.4201f, 14.1259f)
                    curveTo(9.85079f, 13.4143f, 8.98885f, 13.0f, 8.0775f, 13.0f)
                    lineTo(3.0f, 13.0f)
                    curveTo(2.44772f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                    curveTo(2.0f, 11.4477f, 2.44772f, 11.0f, 3.0f, 11.0f)
                    lineTo(8.0775f, 11.0f)
                    curveTo(8.98885f, 11.0f, 9.85079f, 10.5857f, 10.4201f, 9.87409f)
                    lineTo(12.0182f, 7.87653f)
                    curveTo(12.967f, 6.69045f, 14.4036f, 6.0f, 15.9225f, 6.0f)
                    lineTo(17.0f, 6.0f)
                    lineTo(17.0f, 3.93137f)
                    curveTo(17.0f, 3.21864f, 17.8617f, 2.86171f, 18.3657f, 3.36568f)
                    lineTo(21.2929f, 6.29289f)
                    curveTo(21.6834f, 6.68341f, 21.6834f, 7.31658f, 21.2929f, 7.7071f)
                    lineTo(18.3657f, 10.6343f)
                    curveTo(17.8617f, 11.1383f, 17.0f, 10.7813f, 17.0f, 10.0686f)
                    close()
                }
            }.build().also {
                _distribute = it
            }
    }


private var _distribute: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DistributeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Distribute.imageVector,
            contentDescription = null,
    )
}
