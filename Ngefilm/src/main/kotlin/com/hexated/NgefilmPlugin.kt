
package com.hexated

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class NgefilmPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(Ngefilm())
        registerExtractorAPI(Sbsonic())
        registerExtractorAPI(Sbface())
        registerExtractorAPI(Sbrapid())
        registerExtractorAPI(Lvturbo())
        registerExtractorAPI(Ahvsh())
        registerExtractorAPI(Guccihide())
        registerExtractorAPI(Dooood())
    }
}