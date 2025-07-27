package lld.behavioral.mediator;

public
class ExtendedAuctionMediatorDemo {
    public
    static void main(String[] args) throws InterruptedException {
        // Set bidding end time to 5 seconds from now for demo purposes
        long biddingEndTime = System.currentTimeMillis() + 5000;
        AuctionMediator auctionHouse = new ExtendedAuctionHouse(biddingEndTime);
        Bidder bidder1 = new Bidder("Alice", auctionHouse);
        Bidder bidder2 = new Bidder("Bob", auctionHouse);
        Bidder bidder3 = new Bidder("Charlie", auctionHouse);
        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);
        bidder1.placeBid(100);
        Thread.sleep(2000);  // Wait 2 seconds
        bidder2.placeBid(150);
        Thread.sleep(4000);     // Wait additional 4 seconds (after bidding period)
        bidder3.placeBid(200);  // This bid should be rejected
    }
}
