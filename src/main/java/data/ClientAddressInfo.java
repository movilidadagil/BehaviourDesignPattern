package data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public final class ClientAddressInfo {

        public String fullName ;

        public String country ;

        public String address1 ;

        public String city ;

        public String phone ;

        public String zip ;

        public String email ;

        public String state;



    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private @Nonnull
        String fullName;

        private @Nullable
        String country;


        private @Nullable
        String address1 ;

        private @Nullable
        String city ;

        private @Nullable
        String phone ;

        private @Nullable
        String zip ;

        private @Nonnull
        String email ;

        private @Nullable
        String state;


        Builder() {
        }

        public Builder country(@Nonnull String country) {
            this.country = country;
            return this;
        }

        public Builder fullName(@Nullable String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder address1(@Nullable String address1) {
            this.address1 = address1;
            return this;
        }
        public Builder city(@Nonnull String city) {
            this.city = city;
            return this;
        }

        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }

        public Builder zip(@Nullable String zip) {
            this.zip = zip;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public ClientAddressInfo build() {
            if (fullName == null) throw new IllegalStateException("fullname can't be null");
            return new ClientAddressInfo(fullName, country, address1,city,phone,
                            zip,email,state);
        }
    }
    private final ClientAddressInfo.Variables variables;

    public ClientAddressInfo(@Nonnull String fullName, @Nullable String country,
                                    @Nullable String address1,
                             @Nullable String city,
                             @Nullable String phone,
                             @Nullable String zip,
                             @Nullable String email,
                             @Nullable String state) {
        Utils.checkNotNull(fullName, "fullName == null");
        variables = new ClientAddressInfo.Variables(fullName, country, address1,
                                                    city,phone,zip,email,state);
    }


    public static final class Variables  {
        private final @Nonnull String fullName;

        private final @Nullable String country;

        private final @Nullable String address1;
        private final @Nonnull String city;

        private final @Nullable String phone;

        private final @Nullable String zip;

        private final @Nullable String email;
        private final @Nullable String state;


        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@Nonnull String fullName, @Nullable String country,
                  @Nullable String address1,
                  @Nonnull String city, @Nullable String phone,
                  @Nullable String zip, @Nonnull String email, @Nullable String state) {
            this.fullName = fullName;
            this.country = country;
            this.address1 = address1;
            this.city = city;
            this.phone = phone;
            this.zip = zip;
            this.email=email;
            this.state = state;

            this.valueMap.put("fullName", fullName);
            this.valueMap.put("country", country);
            this.valueMap.put("address1", address1);
            this.valueMap.put("city", city);
            this.valueMap.put("phone", phone);
            this.valueMap.put("zip", zip);
            this.valueMap.put("email",email);
            this.valueMap.put("state", state);

        }

        public @Nonnull String fullName() {
            return fullName;
        }

        public @Nullable String country() {
            return country;
        }

        public @Nullable String city() {
            return city;
        }

        public @Nonnull String zip() {
            return zip;
        }

        public @Nullable String state() {
            return state;
        }

        public @Nullable String address1() {
            return address1;
        }

        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }


    }


}
