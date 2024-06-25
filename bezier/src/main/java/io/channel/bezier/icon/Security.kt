@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Security: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _security ?: ImageVector.Builder(
                    name = "Security",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(7.08554f, 11.6387f)
                    lineTo(8.5f, 10.2247f)
                    lineTo(10.8603f, 12.5861f)
                    lineTo(15.5858f, 7.86057f)
                    lineTo(17.0f, 9.27479f)
                    lineTo(10.8601f, 15.4147f)
                    lineTo(7.08554f, 11.6387f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(21.0f, 5.30701f)
                    lineTo(12.0f, 1.93201f)
                    lineTo(3.0f, 5.30701f)
                    lineTo(3.0f, 10.0f)
                    curveTo(3.0f, 14.6688f, 5.63784f, 18.937f, 9.81378f, 21.0249f)
                    lineTo(12.0f, 22.118f)
                    lineTo(14.1862f, 21.0249f)
                    curveTo(18.3622f, 18.937f, 21.0f, 14.6688f, 21.0f, 10.0f)
                    lineTo(21.0f, 5.30701f)
                    close()
                    moveTo(5.0f, 10.0f)
                    lineTo(5.0f, 6.69301f)
                    lineTo(12.0f, 4.06801f)
                    lineTo(19.0f, 6.69301f)
                    lineTo(19.0f, 10.0f)
                    curveTo(19.0f, 13.9113f, 16.7902f, 17.4869f, 13.2918f, 19.2361f)
                    lineTo(12.0f, 19.882f)
                    lineTo(10.7082f, 19.2361f)
                    curveTo(7.20984f, 17.4869f, 5.0f, 13.9113f, 5.0f, 10.0f)
                    close()
                }
            }.build().also {
                _security = it
            }
    }


private var _security: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SecurityIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Security.imageVector,
            contentDescription = null,
    )
}
