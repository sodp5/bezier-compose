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

val BezierIcons.Share: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _share ?: ImageVector.Builder(
                    name = "Share",
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
                    moveTo(13.0002f, 5.20724f)
                    lineTo(15.414f, 7.62113f)
                    curveTo(15.8046f, 8.01165f, 16.4377f, 8.01165f, 16.8282f, 7.62113f)
                    curveTo(17.2188f, 7.2306f, 17.2188f, 6.59744f, 16.8282f, 6.20691f)
                    lineTo(13.0604f, 2.43902f)
                    curveTo(12.4748f, 1.8535f, 11.5247f, 1.8535f, 10.9391f, 2.43902f)
                    lineTo(7.17125f, 6.20691f)
                    curveTo(6.78072f, 6.59744f, 6.78072f, 7.2306f, 7.17125f, 7.62113f)
                    curveTo(7.56177f, 8.01165f, 8.19494f, 8.01165f, 8.58546f, 7.62113f)
                    lineTo(11.0002f, 5.20644f)
                    lineTo(11.0002f, 15.0f)
                    curveTo(11.0002f, 15.5523f, 11.4479f, 16.0f, 12.0002f, 16.0f)
                    curveTo(12.5524f, 16.0f, 13.0002f, 15.5523f, 13.0002f, 15.0f)
                    lineTo(13.0002f, 5.20724f)
                    close()
                    moveTo(6.00015f, 22.0001f)
                    curveTo(3.79101f, 22.0001f, 2.00015f, 20.2093f, 2.00015f, 18.0001f)
                    lineTo(2.00015f, 13.0001f)
                    curveTo(2.00015f, 12.4478f, 2.44787f, 12.0001f, 3.00015f, 12.0001f)
                    curveTo(3.55244f, 12.0001f, 4.00015f, 12.4478f, 4.00015f, 13.0001f)
                    lineTo(4.00015f, 18.0001f)
                    curveTo(4.00015f, 19.1047f, 4.89558f, 20.0001f, 6.00015f, 20.0001f)
                    lineTo(18.0002f, 20.0001f)
                    curveTo(19.1047f, 20.0001f, 20.0002f, 19.1047f, 20.0002f, 18.0001f)
                    lineTo(20.0002f, 13.0001f)
                    curveTo(20.0002f, 12.4478f, 20.4479f, 12.0001f, 21.0002f, 12.0001f)
                    curveTo(21.5524f, 12.0001f, 22.0002f, 12.4478f, 22.0002f, 13.0001f)
                    lineTo(22.0002f, 18.0001f)
                    curveTo(22.0002f, 20.2093f, 20.2093f, 22.0001f, 18.0002f, 22.0001f)
                    lineTo(6.00015f, 22.0001f)
                    close()
                }
            }.build().also {
                _share = it
            }
    }


private var _share: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShareIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Share.imageVector,
            contentDescription = null,
    )
}
