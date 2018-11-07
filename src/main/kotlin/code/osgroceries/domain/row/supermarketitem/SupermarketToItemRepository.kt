package code.osgroceries.domain.row.supermarketitem

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SupermarketToItemRepository : MongoRepository<SupermarketItem, String> {

    fun findBySupermarketIdAndItemId(supermarketId: String, itemId: String): SupermarketItem?
}