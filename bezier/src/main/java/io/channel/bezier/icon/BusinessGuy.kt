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

val BezierIcon.BusinessGuy: ImageVector
    get() {
        return io.channel.bezier.icon._businessGuy ?: ImageVector.Builder(
                name = "BusinessGuy",
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
                moveTo(7.5002f, 6.5001f)
                curveTo(7.5002f, 4.0151f, 9.5152f, 2.0001f, 12.0002f, 2.0001f)
                curveTo(14.4852f, 2.0001f, 16.5002f, 4.0151f, 16.5002f, 6.5001f)
                curveTo(16.5002f, 8.9851f, 14.4852f, 11.0001f, 12.0002f, 11.0001f)
                curveTo(9.5152f, 11.0001f, 7.5002f, 8.9851f, 7.5002f, 6.5001f)
                close()
                moveTo(14.5002f, 6.5001f)
                curveTo(14.5002f, 5.1221f, 13.3782f, 4.0001f, 12.0002f, 4.0001f)
                curveTo(10.6212f, 4.0001f, 9.5002f, 5.1221f, 9.5002f, 6.5001f)
                curveTo(9.5002f, 7.8781f, 10.6212f, 9.0001f, 12.0002f, 9.0001f)
                curveTo(13.3782f, 9.0001f, 14.5002f, 7.8781f, 14.5002f, 6.5001f)
                close()
                moveTo(2.0622f, 20.8761f)
                curveTo(2.6212f, 15.8821f, 6.8572f, 12.0001f, 12.0002f, 12.0001f)
                curveTo(17.1432f, 12.0001f, 21.3792f, 15.8821f, 21.9382f, 20.8761f)
                curveTo(22.0042f, 21.4731f, 21.5442f, 22.0001f, 20.9442f, 22.0001f)
                lineTo(3.0562f, 22.0001f)
                curveTo(2.4562f, 22.0001f, 1.9962f, 21.4731f, 2.0622f, 20.8761f)
                close()
                moveTo(16.4289f, 15.3325f)
                curveTo(15.6008f, 14.7828f, 14.6655f, 14.3842f, 13.6635f, 14.1729f)
                lineTo(13.2764f, 14.9472f)
                curveTo(13.107f, 15.286f, 12.7607f, 15.5f, 12.382f, 15.5f)
                lineTo(11.618f, 15.5f)
                curveTo(11.2393f, 15.5f, 10.893f, 15.286f, 10.7236f, 14.9472f)
                lineTo(10.3365f, 14.1729f)
                curveTo(9.3344f, 14.3842f, 8.3991f, 14.7828f, 7.571f, 15.3323f)
                lineTo(9.5715f, 20.0001f)
                lineTo(10.2f, 20.0001f)
                lineTo(10.8392f, 16.8039f)
                curveTo(10.9327f, 16.3365f, 11.3431f, 16.0f, 11.8198f, 16.0f)
                lineTo(12.1802f, 16.0f)
                curveTo(12.6569f, 16.0f, 13.0673f, 16.3365f, 13.1608f, 16.8039f)
                lineTo(13.8f, 20.0001f)
                lineTo(14.4285f, 20.0001f)
                lineTo(16.4289f, 15.3325f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._businessGuy = it
        }
    }

private var _businessGuy: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BusinessGuyIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BusinessGuy,
            contentDescription = null,
    )
}
