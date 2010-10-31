import code.{Ingredient, RecipeParser}
import org.specs.Specification

object RecipeParserSpec extends Specification {
  "RecipeParser With One Line" should {
    val parser = RecipeParser("1 egu")
    "parse recipe with single line" in {
      parser.getIngredients must beEqualTo(List(new Ingredient("egu", 1)))
    }
  }
}