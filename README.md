// 1. First, define what data you want (like a menu)
interface ApiServices {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadlines(country: String): Response<NewsResponse>
}

// 2. Make the call to get data (like placing order)
class NewsDataSourceImplementation {
    fun getNewsHeadlines(country: String) {
        // Makes API call
    }
}

// 3. Process the response (like kitchen checking order)
class NewsRepo {
    fun getNewsHeadlines() {
        // Handles success/failure
        // Organizes data
    }
}

// 4. Prepare data for UI (like arranging food on tray)
class NewsViewModel {
    // Holds and manages data
    // Updates UI when data changes
}
