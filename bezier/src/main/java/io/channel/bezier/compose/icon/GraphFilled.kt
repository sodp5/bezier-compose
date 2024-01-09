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

val BezierIcon.GraphFilled: ImageVector
    get() {
        return _graphFilled ?: ImageVector.Builder(
                name = "GraphFilled",
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
                moveTo(13.7756f, 21.0001f)
                lineTo(10.2246f, 21.0001f)
                curveTo(9.9626f, 21.0001f, 9.7506f, 20.7871f, 9.7506f, 20.5251f)
                lineTo(9.7506f, 3.4751f)
                curveTo(9.7506f, 3.2121f, 9.9626f, 3.0001f, 10.2246f, 3.0001f)
                lineTo(13.7756f, 3.0001f)
                curveTo(14.0376f, 3.0001f, 14.2506f, 3.2121f, 14.2506f, 3.4751f)
                lineTo(14.2506f, 20.5251f)
                curveTo(14.2506f, 20.7871f, 14.0376f, 21.0001f, 13.7756f, 21.0001f)
                close()
                moveTo(20.5256f, 21.0001f)
                lineTo(16.9746f, 21.0001f)
                curveTo(16.7126f, 21.0001f, 16.5006f, 20.7871f, 16.5006f, 20.5251f)
                lineTo(16.5006f, 8.4751f)
                curveTo(16.5006f, 8.2121f, 16.7126f, 8.0001f, 16.9746f, 8.0001f)
                lineTo(20.5256f, 8.0001f)
                curveTo(20.7876f, 8.0001f, 21.0006f, 8.2121f, 21.0006f, 8.4751f)
                lineTo(21.0006f, 20.5251f)
                curveTo(21.0006f, 20.7871f, 20.7876f, 21.0001f, 20.5256f, 21.0001f)
                close()
                moveTo(3.5201f, 21.0001f)
                lineTo(6.9801f, 21.0001f)
                curveTo(7.2671f, 21.0001f, 7.5001f, 20.7681f, 7.5001f, 20.4801f)
                lineTo(7.5001f, 15.5201f)
                curveTo(7.5001f, 15.2321f, 7.2671f, 15.0001f, 6.9801f, 15.0001f)
                lineTo(3.5201f, 15.0001f)
                curveTo(3.2321f, 15.0001f, 3.0001f, 15.2321f, 3.0001f, 15.5201f)
                lineTo(3.0001f, 20.4801f)
                curveTo(3.0001f, 20.7681f, 3.2321f, 21.0001f, 3.5201f, 21.0001f)
                close()
            }
        }.build().also {
            _graphFilled = it
        }
    }

private var _graphFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GraphFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.GraphFilled,
            contentDescription = null,
    )
}