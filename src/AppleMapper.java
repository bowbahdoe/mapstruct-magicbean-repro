import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

// Uncomment this line to see things stop working
// @Mapper
public interface AppleMapper {

    AppleMapper INSTANCE = Mappers.getMapper( AppleMapper.class );

    AppleDTO appleToAppleDTO(Apple car);
}