public enum Transport {
    CAR {
        @Override
        public double proezd(double distance) {
            return distance;
        }
    },
    BUS {
        @Override
        public double proezd(double distance) {
            return distance;
        }
    },
    TRUCK {
        @Override
        public double proezd(double distance) {
            return  distance;
        }
    };

    public abstract double proezd(double distance);
}
