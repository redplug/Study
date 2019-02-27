package com.example.mykotlin



class MovieKotlin {
    var leadingActors: List<ActorKotlin?>? = null

    var supportingActors: List<ActorKotlin?>? = null

    var title: String? = null

    var showingAge: Int = 0

    var genre: String? = null

    class ActorKotlin {
        var realname: String? = null

        var stageName: String? = null

        var age: Int = 0

        var gender: String? =null

        var actedMovies: List<MovieKotlin?>?= null

    }

    fun casting(movies: List<MovieKotlin?>?): MutableList<ActorKotlin> {
        var recommendActors = mutableListOf<ActorKotlin>()
        movies?.forEach { movie ->
            if (movie?.title?.contains("도시") == true) {
                    movie.leadingActors?.filter {
                        it?.gender == "W" && it.age >= 20 && it.age < 30 && (it.actedMovies?.size ?: 0)>5
                    }?.forEach { it?.let {recommendActors.add(it)}}

                    movie.supportingActors?.filter {
                    it?.gender == "M" && it.age >= 30 && it.age < 40 && it.actedMovies?.filter {it?.genre == "공포"}?.size ?: 0 > 3}?.forEach { it?.let {recommendActors.add(it) } }
            }
        }
        return recommendActors
    }
}
