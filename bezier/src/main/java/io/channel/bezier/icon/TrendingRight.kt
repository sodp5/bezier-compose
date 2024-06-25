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

val BezierIcons.TrendingRight: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _trendingRight ?: ImageVector.Builder(
                    name = "TrendingRight",
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
                    moveTo(17.8485f, 11.634f)
                    lineTo(12.6825f, 6.46804f)
                    curveTo(12.4305f, 6.21604f, 11.9995f, 6.39404f, 11.9995f, 6.75104f)
                    lineTo(11.9995f, 9.99887f)
                    lineTo(6.5f, 9.99887f)
                    curveTo(6.224f, 9.99887f, 6.0f, 10.2229f, 6.0f, 10.4989f)
                    lineTo(6.0f, 13.4989f)
                    curveTo(6.0f, 13.7749f, 6.224f, 13.9989f, 6.5f, 13.9989f)
                    lineTo(11.9995f, 13.9989f)
                    lineTo(11.9995f, 17.248f)
                    curveTo(11.9995f, 17.605f, 12.4305f, 17.783f, 12.6825f, 17.531f)
                    lineTo(17.8485f, 12.366f)
                    curveTo(18.0505f, 12.163f, 18.0505f, 11.836f, 17.8485f, 11.634f)
                    close()
                }
            }.build().also {
                _trendingRight = it
            }
    }


private var _trendingRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TrendingRight.imageVector,
            contentDescription = null,
    )
}
