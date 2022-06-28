package kotlin2.`enum`.expected.client

import com.netflix.graphql.dgs.client.codegen.GraphQLProjection

public class QueryProjection : GraphQLProjection() {
  public val types: QueryProjection
    get() {
      field("types")
      return this
    }
}