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

val BezierIcon.SurveyCheck: ImageVector
    get() {
        return _surveyCheck ?: ImageVector.Builder(
                name = "SurveyCheck",
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
                moveTo(9.0f, 2.0f)
                curveTo(8.4477f, 2.0f, 8.0f, 2.4477f, 8.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                curveTo(5.3432f, 3.0f, 4.0f, 4.3432f, 4.0f, 6.0f)
                lineTo(4.0f, 19.0f)
                curveTo(4.0f, 20.6569f, 5.3432f, 22.0f, 7.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                curveTo(18.6569f, 22.0f, 20.0f, 20.6569f, 20.0f, 19.0f)
                lineTo(20.0f, 15.5f)
                lineTo(18.0f, 15.5f)
                lineTo(18.0f, 19.0f)
                curveTo(18.0f, 19.5523f, 17.5523f, 20.0f, 17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                lineTo(6.0f, 6.0f)
                curveTo(6.0f, 5.4477f, 6.4477f, 5.0f, 7.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                curveTo(8.0f, 5.5523f, 8.4477f, 6.0f, 9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                curveTo(15.5523f, 6.0f, 16.0f, 5.5523f, 16.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                curveTo(17.5523f, 5.0f, 18.0f, 5.4477f, 18.0f, 6.0f)
                lineTo(18.0f, 7.5f)
                lineTo(20.0f, 7.5f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 4.3432f, 18.6569f, 3.0f, 17.0f, 3.0f)
                lineTo(16.0f, 3.0f)
                curveTo(16.0f, 2.4477f, 15.5523f, 2.0f, 15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(14.154f, 16.068f)
                lineTo(10.0f, 12.08f)
                lineTo(11.385f, 10.636f)
                lineTo(14.169f, 13.309f)
                lineTo(19.82f, 8.0f)
                lineTo(21.189f, 9.457f)
                lineTo(14.154f, 16.068f)
                close()
            }
        }.build().also {
            _surveyCheck = it
        }
    }

private var _surveyCheck: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SurveyCheckIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SurveyCheck,
            contentDescription = null,
    )
}
