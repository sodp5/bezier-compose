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

val BezierIcon.Clock: ImageVector
    get() {
        return io.channel.bezier.icon._clock ?: ImageVector.Builder(
                name = "Clock",
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
                moveTo(20.0488f, 11.999f)
                curveTo(20.0488f, 16.4368f, 16.4378f, 20.0478f, 12.0f, 20.0478f)
                curveTo(7.5622f, 20.0478f, 3.9512f, 16.4368f, 3.9512f, 11.999f)
                curveTo(3.9512f, 7.5621f, 7.5624f, 3.9512f, 12.0f, 3.9512f)
                curveTo(16.4376f, 3.9512f, 20.0488f, 7.5621f, 20.0488f, 11.999f)
                close()
                moveTo(2.0f, 11.999f)
                curveTo(2.0f, 17.5144f, 6.4846f, 21.999f, 12.0f, 21.999f)
                curveTo(17.5154f, 21.999f, 22.0f, 17.5144f, 22.0f, 11.999f)
                curveTo(22.0f, 6.4844f, 17.5152f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4848f, 2.0f, 2.0f, 6.4844f, 2.0f, 11.999f)
                close()
                moveTo(12.0f, 6.0208f)
                curveTo(12.5523f, 6.0208f, 13.0f, 6.4685f, 13.0f, 7.0208f)
                lineTo(13.0f, 11.3364f)
                lineTo(15.6397f, 12.688f)
                curveTo(16.1312f, 12.9397f, 16.3257f, 13.5422f, 16.074f, 14.0338f)
                curveTo(15.8223f, 14.5254f, 15.2197f, 14.7199f, 14.7281f, 14.4682f)
                lineTo(11.5442f, 12.8379f)
                curveTo(11.2102f, 12.6669f, 11.0f, 12.3232f, 11.0f, 11.9478f)
                lineTo(11.0f, 7.0208f)
                curveTo(11.0f, 6.4685f, 11.4477f, 6.0208f, 12.0f, 6.0208f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._clock = it
        }
    }

private var _clock: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ClockIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Clock,
            contentDescription = null,
    )
}
