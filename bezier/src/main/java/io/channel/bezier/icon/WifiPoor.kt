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

val BezierIcons.WifiPoor: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _wifiPoor ?: ImageVector.Builder(
                    name = "WifiPoor",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(None),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(16.44f, 14.588f)
                    arcTo(0.53f, 0.53f, 130.0617661913365f, isMoreThanHalf = false, isPositiveArc = false, 17.158f, 14.555f)
                    lineTo(18.5f, 13.14f)
                    curveTo(18.71f, 12.92f, 18.7f, 12.57f, 18.47f, 12.373000000000001f)
                    arcTo(9.96f, 9.96f, 310.3816796462916f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 10.0f)
                    arcTo(9.96f, 9.96f, 270.08718168429937f, isMoreThanHalf = false, isPositiveArc = false, 5.532f, 12.373000000000001f)
                    arcTo(0.527f, 0.527f, 229.05838379522805f, isMoreThanHalf = false, isPositiveArc = false, 5.501f, 13.14f)
                    lineTo(6.841f, 14.555f)
                    curveTo(7.031000000000001f, 14.754999999999999f, 7.347f, 14.763f, 7.561f, 14.588f)
                    arcTo(6.97f, 6.97f, 230.54873786211982f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 13.0f)
                    curveTo(13.685f, 13.0f, 15.231f, 13.595f, 16.44f, 14.588000000000001f)
                    moveTo(19.883f, 10.952f)
                    arcTo(0.517f, 0.517f, 131.54495568990436f, isMoreThanHalf = false, isPositiveArc = false, 20.596999999999998f, 10.925f)
                    lineTo(21.938f, 9.510000000000002f)
                    curveTo(22.147f, 9.290000000000001f, 22.137999999999998f, 8.940000000000001f, 21.91f, 8.740000000000002f)
                    arcTo(14.94f, 14.94f, 311.4387017159682f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 5.0f)
                    arcTo(14.94f, 14.94f, 270.08603266656394f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 8.74f)
                    arcTo(0.535f, 0.535f, 228.14545090033627f, isMoreThanHalf = false, isPositiveArc = false, 2.062f, 9.51f)
                    lineTo(3.4029999999999996f, 10.925f)
                    curveTo(3.5929999999999995f, 11.126000000000001f, 3.909f, 11.134f, 4.116999999999999f, 10.952f)
                    arcTo(11.95f, 11.95f, 228.84825671583874f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 8.0f)
                    curveTo(15.017f, 8.0f, 17.774f, 9.114f, 19.883f, 10.952f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(8.98f, 16.015f)
                    curveTo(8.738f, 16.198f, 8.73f, 16.549f, 8.940000000000001f, 16.769000000000002f)
                    lineTo(11.637f, 19.617f)
                    arcTo(0.5f, 0.5f, 136.55209973030455f, isMoreThanHalf = false, isPositiveArc = false, 12.363f, 19.617f)
                    lineTo(15.061f, 16.769000000000002f)
                    curveTo(15.269f, 16.549000000000003f, 15.261f, 16.199f, 15.02f, 16.015f)
                    arcTo(4.98f, 4.98f, 307.23278812143695f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 15.0f)
                    curveTo(10.866f, 15.0f, 9.82f, 15.378f, 8.98f, 16.015f)
                }
            }.build().also {
                _wifiPoor = it
            }
    }


private var _wifiPoor: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WifiPoorIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.WifiPoor.imageVector,
            contentDescription = null,
    )
}
