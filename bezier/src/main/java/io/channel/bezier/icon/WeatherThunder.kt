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
import io.channel.bezier.BezierIcons

val BezierIcons.WeatherThunder: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _weatherThunder ?: ImageVector.Builder(
                    name = "WeatherThunder",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(23.0f, 10.927f)
                    arcTo(6.087f, 6.087f, 0.06585184749713704f, isMoreThanHalf = false, isPositiveArc = true, 16.92f, 17.006999999999998f)
                    lineTo(16.92f, 15.006999999999998f)
                    arcTo(4.084f, 4.084f, 89.9439101298301f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 10.926999999999998f)
                    curveTo(21.0f, 8.676999999999998f, 19.17f, 6.846999999999998f, 16.92f, 6.846999999999998f)
                    lineTo(15.722000000000001f, 6.846999999999998f)
                    lineTo(15.432000000000002f, 6.352999999999998f)
                    curveTo(14.712000000000002f, 5.1229999999999976f, 13.448000000000002f, 4.389999999999998f, 12.049000000000003f, 4.389999999999998f)
                    curveTo(10.117000000000003f, 4.389999999999998f, 8.449000000000003f, 5.8409999999999975f, 8.172000000000004f, 7.764999999999998f)
                    lineTo(8.049000000000005f, 8.621999999999998f)
                    lineTo(6.0190000000000055f, 8.621999999999998f)
                    arcTo(3.024f, 3.024f, 269.9053148927004f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 11.642f)
                    lineTo(3.0f, 11.985999999999999f)
                    arcTo(3.024f, 3.024f, 179.94320902678524f, isMoreThanHalf = false, isPositiveArc = false, 6.02f, 15.006999999999998f)
                    lineTo(8.004999999999999f, 15.006999999999998f)
                    lineTo(8.004999999999999f, 17.006999999999998f)
                    lineTo(6.02f, 17.006999999999998f)
                    arcTo(5.026f, 5.026f, 90.06837096379509f, isMoreThanHalf = false, isPositiveArc = true, 1.0f, 11.986f)
                    lineTo(1.0f, 11.642000000000001f)
                    arcTo(5.026f, 5.026f, 180.06835849688613f, isMoreThanHalf = false, isPositiveArc = true, 6.02f, 6.622000000000002f)
                    lineTo(6.382999999999999f, 6.622000000000002f)
                    curveTo(7.1259999999999994f, 4.157000000000002f, 9.424999999999999f, 2.3900000000000015f, 12.049f, 2.3900000000000015f)
                    arcTo(5.95f, 5.95f, 270.2970384028572f, isMoreThanHalf = false, isPositiveArc = true, 16.835f, 4.847000000000001f)
                    lineTo(16.921f, 4.847000000000001f)
                    arcTo(6.086f, 6.086f, 270.06587271008203f, isMoreThanHalf = false, isPositiveArc = true, 23.0f, 10.927f)
                    moveTo(13.545f, 15.992f)
                    lineTo(16.087f, 16.580000000000002f)
                    arcTo(0.295f, 0.295f, 283.2052101538468f, isMoreThanHalf = false, isPositiveArc = true, 16.229f, 17.075000000000003f)
                    lineTo(10.152999999999999f, 23.168000000000003f)
                    curveTo(9.937999999999999f, 23.384000000000004f, 9.576999999999998f, 23.17f, 9.662999999999998f, 22.878000000000004f)
                    lineTo(10.887999999999998f, 18.709000000000003f)
                    lineTo(8.345999999999998f, 18.121000000000002f)
                    arcTo(0.295f, 0.295f, 103.20521015384679f, isMoreThanHalf = false, isPositiveArc = true, 8.203999999999999f, 17.626f)
                    lineTo(14.279999999999998f, 11.533000000000001f)
                    curveTo(14.494999999999997f, 11.317000000000002f, 14.856999999999998f, 11.531f, 14.770999999999997f, 11.824000000000002f)
                    close()
                }
            }.build().also {
                _weatherThunder = it
            }
    }


private var _weatherThunder: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WeatherThunderIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.WeatherThunder.imageVector,
            contentDescription = null,
    )
}