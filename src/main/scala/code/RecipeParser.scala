package code

object RecipeParser {
  def apply(recipe: String) = new RecipeParser(recipe)
}

class RecipeParser(recipe: String) {
  def parseRecipe = {
    recipe.split("\n")
  }

  def getIngredients: List[Ingredient] = {
    parseRecipe.map(line => new Ingredient(line.split(" ").tail.mkString(" "), line.split(" ").head.toInt)).toList
  }
}

object Ingredient {
  def apply(a:String, b: Int) = new Ingredient(a, b)
}

class Ingredient(val ingredient: String, val amount: Int) {
  override def equals(other: Any) = other match {
    case x:Ingredient => x.ingredient == ingredient && x.amount == amount
    case _ => false
  }
}
