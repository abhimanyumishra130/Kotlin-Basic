fun main(){
    val scores = arrayOf(10,12,2,1,26)

    var low = scores[0]

    for(i in scores){
        if(i < low){
            low = i
        }
    }
    print(low)
}