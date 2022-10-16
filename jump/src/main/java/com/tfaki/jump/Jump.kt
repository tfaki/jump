package com.tfaki.jump

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntOffset
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

/**
 * Created by talhafaki on 15.10.2022.
 */

@Composable
fun Jump(
    modifier: Modifier = Modifier,
    toDirection: Int,
    bounceType: BounceType = BounceType.HIGH_BOUNCE,
    contentAlignment: Alignment = Alignment.TopCenter,
    content: @Composable () -> Unit? = {}
) {
    val scope = rememberCoroutineScope()
    val offsetY by remember { mutableStateOf(Animatable(0f)) }

    scope.launch {
        offsetY.snapTo(offsetY.value - toDirection)
        offsetY.animateTo(
            targetValue = 0f,
            spring(
                dampingRatio = bounceType.value,
                stiffness = Spring.StiffnessMediumLow
            )
        )
    }
    Box(
        modifier = modifier
            .offset {
                IntOffset(0, offsetY.value.roundToInt())
            },
        contentAlignment = contentAlignment
    ) {
        content.invoke()
    }
}
enum class BounceType(val value: Float) {
    HIGH_BOUNCE(Spring.DampingRatioHighBouncy),
    MEDIUM_BOUNCE(Spring.DampingRatioMediumBouncy),
    LOW_BOUNCE(Spring.DampingRatioLowBouncy),
    NO_BOUNCE(Spring.DampingRatioNoBouncy)
}