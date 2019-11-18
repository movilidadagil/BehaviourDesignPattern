package data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class ClientLoginInfo {
    public String email;
    public String password;

    public static ClientLoginInfo.Builder builder() {
        return new ClientLoginInfo.Builder();
    }


    public static final class Builder {
        private @Nonnull
        String email;

        private @Nullable
        String password;





        Builder() {
        }

        public ClientLoginInfo.Builder email(@Nonnull String email) {
            this.email = email;
            return this;
        }

        public ClientLoginInfo.Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }



        public ClientLoginInfo build() {
            if (email == null) throw new IllegalStateException("email can't be null");
            return new ClientLoginInfo(email, password);
        }
    }
    private final ClientLoginInfo.Variables variables;

    public ClientLoginInfo(@Nonnull String email,
                             @Nonnull String password) {
        Utils.checkNotNull(email, "email == null");
        variables = new ClientLoginInfo.Variables(email, password);
    }


    public static final class Variables  {
        private final @Nonnull String email;

        private final @Nonnull String password;




        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@Nonnull String email, @Nonnull String password) {
            this.email = email;
            this.password = password;


            this.valueMap.put("email", email);
            this.valueMap.put("password", password);


        }

        public @Nonnull String email() {
            return email;
        }

        public @Nullable String password() {
            return password;
        }


        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }


    }
}
