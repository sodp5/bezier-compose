@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.VolumeDown: ImageVector
    get() {
        return _volumeDown ?: ImageVector.Builder(
                name = "VolumeDown",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.0002f, 2.0001f)
                lineTo(12.8687f, 2.0088f)
                curveTo(12.652f, 2.0375f, 12.4494f, 2.1367f, 12.2931f, 2.293f)
                lineTo(7.585f, 7.0f)
                lineTo(3.0002f, 7.0001f)
                curveTo(2.4479f, 7.0001f, 2.0002f, 7.4478f, 2.0002f, 8.0001f)
                lineTo(2.0002f, 16.0001f)
                lineTo(2.0069f, 16.1167f)
                curveTo(2.0647f, 16.6141f, 2.4873f, 17.0001f, 3.0002f, 17.0001f)
                lineTo(7.586f, 17.0f)
                lineTo(12.2931f, 21.7072f)
                curveTo(12.4806f, 21.8948f, 12.735f, 22.0001f, 13.0002f, 22.0001f)
                lineTo(14.0002f, 22.0001f)
                curveTo(14.5525f, 22.0001f, 15.0002f, 21.5524f, 15.0002f, 21.0001f)
                lineTo(15.0002f, 3.0001f)
                curveTo(15.0002f, 2.4478f, 14.5525f, 2.0001f, 14.0002f, 2.0001f)
                lineTo(13.0002f, 2.0001f)
                close()
                moveTo(13.0f, 4.414f)
                lineTo(13.0f, 19.585f)
                lineTo(8.7073f, 15.293f)
                lineTo(8.6082f, 15.2062f)
                curveTo(8.4347f, 15.0733f, 8.2212f, 15.0001f, 8.0002f, 15.0001f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 9.0f)
                lineTo(8.0002f, 9.0001f)
                curveTo(8.2654f, 9.0001f, 8.5198f, 8.8947f, 8.7073f, 8.7072f)
                lineTo(13.0f, 4.414f)
                close()
                moveTo(19.8814f, 8.5222f)
                curveTo(19.5672f, 8.068f, 18.9248f, 8.0717f, 18.5343f, 8.4622f)
                lineTo(18.4971f, 8.4994f)
                curveTo(18.1214f, 8.8751f, 18.1173f, 9.4754f, 18.3741f, 9.9405f)
                curveTo(19.0741f, 11.2082f, 19.1223f, 12.8098f, 18.4179f, 14.0538f)
                curveTo(18.1515f, 14.5244f, 18.1372f, 15.1411f, 18.5196f, 15.5235f)
                curveTo(18.9133f, 15.9172f, 19.5629f, 15.9064f, 19.8672f, 15.4401f)
                curveTo(21.2254f, 13.3595f, 21.2874f, 10.5544f, 19.8814f, 8.5222f)
                close()
            }
        }.build().also {
            _volumeDown = it
        }
    }

private var _volumeDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VolumeDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.VolumeDown,
            contentDescription = null,
    )
}