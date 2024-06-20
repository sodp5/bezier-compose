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

val BezierIcons.HelpFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _helpFilled ?: ImageVector.Builder(
                    name = "HelpFilled",
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
                    moveTo(12.0f, 2.0f)
                    curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                    moveTo(12.83f, 14.541f)
                    lineTo(10.93f, 14.541f)
                    lineTo(10.93f, 13.833f)
                    curveTo(10.93f, 12.677f, 11.555f, 11.593f, 12.602f, 10.933f)
                    curveTo(13.469000000000001f, 10.387f, 13.939f, 9.994f, 13.939f, 9.486f)
                    curveTo(13.939f, 8.472000000000001f, 12.939f, 7.925000000000001f, 11.999f, 7.925000000000001f)
                    curveTo(10.964f, 7.925000000000001f, 10.057f, 8.655000000000001f, 10.057f, 9.485000000000001f)
                    lineTo(8.157f, 9.485000000000001f)
                    curveTo(8.157f, 7.610000000000001f, 9.915f, 6.025000000000001f, 11.998000000000001f, 6.025000000000001f)
                    curveTo(14.152000000000001f, 6.025000000000001f, 15.840000000000002f, 7.545000000000002f, 15.840000000000002f, 9.485000000000001f)
                    curveTo(15.840000000000002f, 11.14f, 14.448000000000002f, 12.018f, 13.615000000000002f, 12.541f)
                    curveTo(13.379000000000001f, 12.691f, 12.831000000000001f, 13.114f, 12.831000000000001f, 13.833f)
                    close()
                    moveTo(11.941f, 18.172f)
                    arcTo(1.244f, 1.244f, 88.37547279128545f, isMoreThanHalf = true, isPositiveArc = true, 11.941f, 15.685f)
                    arcTo(1.244f, 1.244f, 271.62452720871454f, isMoreThanHalf = false, isPositiveArc = true, 11.941f, 18.172f)
                }
            }.build().also {
                _helpFilled = it
            }
    }


private var _helpFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HelpFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HelpFilled.imageVector,
            contentDescription = null,
    )
}