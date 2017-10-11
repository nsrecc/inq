package core

import java.util.UUID

import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import core.ESBase.client
import org.joda.time.DateTime
import services.model.Question

object Test {
  def main(args: Array[String]) {
    ESBase.insert(Question(UUID.randomUUID(), UUID.randomUUID(), "Who are you?", Set.empty, new DateTime()))

    println("here!")

    /*
     * Delete Question by ID
     */
    val q1 = Question(UUID.randomUUID(), UUID.randomUUID(), "Test Delete Question by ID", Set.empty, new DateTime())
    ESBase.insert(q1)
    ESBase.deleteByID(q1.id, q1.estype)
  }
}
