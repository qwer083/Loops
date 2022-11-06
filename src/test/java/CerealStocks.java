
public class CerealStocks {
    public static void main(String[] args) {
        long sumCosts = calculateCostsForStoreBuckwheat(6, 100, 100);
        System.out.println(sumCosts);
    }

        public static Long calculateCostsForStoreBuckwheat(long monthConsumingKg,  long reserveKg, long priceForStoreOneKg) {

            long durationConsuming = reserveKg / monthConsumingKg;

            long sumCosts = reserveKg * priceForStoreOneKg;


            for (long i = 1; i <= durationConsuming; i++) {

                reserveKg = reserveKg-monthConsumingKg;
                sumCosts = sumCosts+reserveKg*priceForStoreOneKg;

            }
            return sumCosts;


        }
  }

