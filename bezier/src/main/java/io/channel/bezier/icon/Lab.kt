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

val BezierIcon.Lab: ImageVector
    get() {
        return io.channel.bezier.icon._lab ?: ImageVector.Builder(
                name = "Lab",
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
                moveTo(9.0002f, 2.0001f)
                lineTo(15.0002f, 2.0001f)
                curveTo(15.5522f, 2.0001f, 16.0002f, 2.4481f, 16.0002f, 3.0001f)
                lineTo(16.0002f, 9.4261f)
                curveTo(16.0002f, 9.8011f, 16.1052f, 10.1681f, 16.3042f, 10.4861f)
                lineTo(20.3922f, 17.0271f)
                curveTo(20.7892f, 17.6631f, 21.0002f, 18.3971f, 21.0002f, 19.1471f)
                lineTo(21.0002f, 21.0001f)
                curveTo(21.0002f, 21.5521f, 20.5522f, 22.0001f, 20.0002f, 22.0001f)
                lineTo(4.0002f, 22.0001f)
                curveTo(3.4482f, 22.0001f, 3.0002f, 21.5521f, 3.0002f, 21.0001f)
                lineTo(3.0002f, 19.1471f)
                curveTo(3.0002f, 18.3971f, 3.2102f, 17.6631f, 3.6082f, 17.0271f)
                lineTo(7.6962f, 10.4861f)
                curveTo(7.8952f, 10.1681f, 8.0002f, 9.8011f, 8.0002f, 9.4261f)
                lineTo(8.0002f, 3.0001f)
                curveTo(8.0002f, 2.4481f, 8.4482f, 2.0001f, 9.0002f, 2.0001f)
                close()
                moveTo(14.0002f, 9.4261f)
                lineTo(14.0002f, 4.0001f)
                lineTo(10.0002f, 4.0001f)
                lineTo(10.0002f, 9.4261f)
                curveTo(10.0002f, 10.1771f, 9.7902f, 10.9101f, 9.3922f, 11.5461f)
                lineTo(5.3042f, 18.0871f)
                curveTo(5.1052f, 18.4051f, 5.0002f, 18.7721f, 5.0002f, 19.1471f)
                lineTo(5.0002f, 20.0001f)
                lineTo(19.0002f, 20.0001f)
                lineTo(19.0002f, 19.1471f)
                curveTo(19.0002f, 18.7721f, 18.8952f, 18.4051f, 18.6962f, 18.0871f)
                lineTo(14.6082f, 11.5461f)
                curveTo(14.2102f, 10.9101f, 14.0002f, 10.1771f, 14.0002f, 9.4261f)
                close()
                moveTo(13.7125f, 12.0f)
                lineTo(17.8805f, 18.669f)
                curveTo(17.9435f, 18.77f, 17.9825f, 18.883f, 17.9955f, 19.0f)
                lineTo(6.0045f, 19.0f)
                curveTo(6.0175f, 18.883f, 6.0565f, 18.77f, 6.1195f, 18.669f)
                lineTo(10.2875f, 12.0f)
                lineTo(13.7125f, 12.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._lab = it
        }
    }

private var _lab: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LabIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Lab,
            contentDescription = null,
    )
}
