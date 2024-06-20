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

val BezierIcons.PeopleList: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _peopleList ?: ImageVector.Builder(
                    name = "PeopleList",
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
                    moveTo(5.0f, 7.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 5.0f, 3.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 7.0f)
                    moveTo(3.0f, 16.0f)
                    lineTo(4.0f, 16.0f)
                    lineTo(4.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 6.0f, 20.0f)
                    lineTo(6.0f, 16.0f)
                    lineTo(7.0f, 16.0f)
                    lineTo(7.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 8.0f)
                    lineTo(4.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 9.0f)
                    close()
                    moveTo(10.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 6.0f)
                    lineTo(20.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 4.0f)
                    lineTo(11.0f, 4.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 10.0f, 5.0f)
                    moveTo(10.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 13.0f)
                    lineTo(20.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 11.0f)
                    lineTo(11.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 10.0f, 12.0f)
                    moveTo(11.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 18.0f)
                    lineTo(20.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 20.0f)
                    close()
                }
            }.build().also {
                _peopleList = it
            }
    }


private var _peopleList: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PeopleListIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PeopleList.imageVector,
            contentDescription = null,
    )
}