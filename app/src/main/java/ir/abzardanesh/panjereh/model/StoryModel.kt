package ir.abzardanesh.panjereh.model

data class StoryModel(
    private var imageUrl:String,
    private var storyId:String,
    private var userId:String,
    private var timeStart:Long=0,
    private var timeEnd:Long=0,
)
