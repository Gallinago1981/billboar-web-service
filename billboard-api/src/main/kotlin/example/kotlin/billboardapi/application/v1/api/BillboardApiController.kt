package example.kotlin.billboardapi.application.v1.api

import exsample.kotlin.billboardapi.application.v1.api.BillboardApi
import exsample.kotlin.billboardapi.application.v1.model.Comment
import exsample.kotlin.billboardapi.application.v1.model.Thread
import exsample.kotlin.billboardapi.application.v1.model.ThreadList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@Validated
@RequestMapping("\${api.base-path:/v1}")
@RestController
class BillboardApiController(): BillboardApi {


    @RequestMapping(
            value = ["/thread/{threadId}"],
            produces = ["application/json"],
            method = [RequestMethod.GET])
    override fun showThread( @PathVariable("threadId") threadId: kotlin.Int
    ): ResponseEntity<List<Thread>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/threads"],
            produces = ["application/json"],
            method = [RequestMethod.GET])
    override fun threadList(): ResponseEntity<List<ThreadList>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/thread/{threadId}"],
            produces = ["application/json"],
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    override fun writeComment( @PathVariable("threadId") threadId: kotlin.Int
                      , @Valid @RequestBody comment: Comment?
    ): ResponseEntity<Comment> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @RequestMapping(
            value = ["/comment/like/{threadId}/{seq}"],
            method = [RequestMethod.PUT])
    override fun commentLikeThreadIdSeqPut( @PathVariable("threadId") threadId: kotlin.Int
                                            , @PathVariable("seq") seq: kotlin.Int
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

}