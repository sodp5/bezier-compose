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

val BezierIcon.ZoomIn: ImageVector
    get() {
        return io.channel.bezier.icon._zoomIn ?: ImageVector.Builder(
                name = "ZoomIn",
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
                moveTo(4.0002f, 10.0001f)
                curveTo(4.0002f, 13.3091f, 6.6912f, 16.0001f, 10.0002f, 16.0001f)
                curveTo(13.3092f, 16.0001f, 16.0002f, 13.3091f, 16.0002f, 10.0001f)
                curveTo(16.0002f, 6.6911f, 13.3092f, 4.0001f, 10.0002f, 4.0001f)
                curveTo(6.6912f, 4.0001f, 4.0002f, 6.6911f, 4.0002f, 10.0001f)
                close()
                moveTo(21.7072f, 20.293f)
                curveTo(22.0977f, 20.6835f, 22.0977f, 21.3166f, 21.7072f, 21.7071f)
                curveTo(21.3167f, 22.0976f, 20.6836f, 22.0976f, 20.2931f, 21.7071f)
                lineTo(14.8972f, 16.3121f)
                curveTo(13.5422f, 17.3661f, 11.8462f, 18.0001f, 10.0002f, 18.0001f)
                curveTo(5.5892f, 18.0001f, 2.0002f, 14.4111f, 2.0002f, 10.0001f)
                curveTo(2.0002f, 5.5891f, 5.5892f, 2.0001f, 10.0002f, 2.0001f)
                curveTo(14.4112f, 2.0001f, 18.0002f, 5.5891f, 18.0002f, 10.0001f)
                curveTo(18.0002f, 11.8461f, 17.3662f, 13.5421f, 16.3122f, 14.8971f)
                lineTo(21.7072f, 20.293f)
                close()
                moveTo(9.0002f, 9.0001f)
                lineTo(9.0002f, 6.0001f)
                lineTo(11.0002f, 6.0001f)
                lineTo(11.0002f, 9.0001f)
                lineTo(14.0002f, 9.0001f)
                lineTo(14.0002f, 11.0001f)
                lineTo(11.0002f, 11.0001f)
                lineTo(11.0002f, 14.0001f)
                lineTo(9.0002f, 14.0001f)
                lineTo(9.0002f, 11.0001f)
                lineTo(6.0002f, 11.0001f)
                lineTo(6.0002f, 9.0001f)
                lineTo(9.0002f, 9.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._zoomIn = it
        }
    }

private var _zoomIn: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ZoomInIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ZoomIn,
            contentDescription = null,
    )
}
