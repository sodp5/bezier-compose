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

val BezierIcon.PersonAdd: ImageVector
    get() {
        return io.channel.bezier.icon._personAdd ?: ImageVector.Builder(
                name = "PersonAdd",
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
                moveTo(17.9984f, 4.0001f)
                curveTo(17.9984f, 3.4478f, 18.4461f, 3.0001f, 18.9984f, 3.0001f)
                curveTo(19.5506f, 3.0001f, 19.9984f, 3.4478f, 19.9984f, 4.0001f)
                lineTo(19.9984f, 6.0001f)
                lineTo(21.9984f, 6.0001f)
                curveTo(22.5506f, 6.0001f, 22.9984f, 6.4478f, 22.9984f, 7.0001f)
                curveTo(22.9984f, 7.5524f, 22.5506f, 8.0001f, 21.9984f, 8.0001f)
                lineTo(19.9984f, 8.0001f)
                lineTo(19.9984f, 10.0001f)
                curveTo(19.9984f, 10.5523f, 19.5506f, 11.0001f, 18.9984f, 11.0001f)
                curveTo(18.4461f, 11.0001f, 17.9984f, 10.5523f, 17.9984f, 10.0001f)
                lineTo(17.9984f, 8.0001f)
                lineTo(15.9984f, 8.0001f)
                curveTo(15.4461f, 8.0001f, 14.9984f, 7.5524f, 14.9984f, 7.0001f)
                curveTo(14.9984f, 6.4478f, 15.4461f, 6.0001f, 15.9984f, 6.0001f)
                lineTo(17.9984f, 6.0001f)
                lineTo(17.9984f, 4.0001f)
                close()
                moveTo(12.58f, 8.5998f)
                curveTo(12.58f, 9.4832f, 11.8634f, 10.1998f, 10.98f, 10.1998f)
                curveTo(10.0966f, 10.1998f, 9.38f, 9.4832f, 9.38f, 8.5998f)
                curveTo(9.38f, 7.7163f, 10.0966f, 6.9998f, 10.98f, 6.9998f)
                curveTo(11.8634f, 6.9998f, 12.58f, 7.7163f, 12.58f, 8.5998f)
                close()
                moveTo(10.98f, 12.1998f)
                curveTo(12.968f, 12.1998f, 14.58f, 10.5878f, 14.58f, 8.5998f)
                curveTo(14.58f, 6.6118f, 12.968f, 4.9998f, 10.98f, 4.9998f)
                curveTo(8.992f, 4.9998f, 7.38f, 6.6118f, 7.38f, 8.5998f)
                curveTo(7.38f, 10.5878f, 8.992f, 12.1998f, 10.98f, 12.1998f)
                close()
                moveTo(10.984f, 15.0001f)
                curveTo(13.5959f, 15.0001f, 15.8192f, 16.6702f, 16.6427f, 19.0001f)
                lineTo(5.3252f, 19.0001f)
                curveTo(6.1488f, 16.6702f, 8.372f, 15.0001f, 10.984f, 15.0001f)
                close()
                moveTo(18.461f, 21.0001f)
                curveTo(18.746f, 21.0001f, 18.985f, 20.7601f, 18.967f, 20.4761f)
                curveTo(18.697f, 16.3021f, 15.226f, 13.0001f, 10.984f, 13.0001f)
                curveTo(6.742f, 13.0001f, 3.271f, 16.3021f, 3.001f, 20.4761f)
                curveTo(2.9829f, 20.7601f, 3.222f, 21.0001f, 3.5069f, 21.0001f)
                lineTo(18.461f, 21.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._personAdd = it
        }
    }

private var _personAdd: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonAddIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.PersonAdd,
            contentDescription = null,
    )
}
